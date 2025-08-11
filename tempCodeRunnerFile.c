#include <stdio.h>
#include <ctype.h>
#include <string.h>

#define MAX_TOKEN_LENGTH 100
#define MAX_LIST_SIZE 100

// List of keywords
const char *keywords[] = {"int", "float", "if", "else", "return", "while", "for", "char"};
#define NUM_KEYWORDS (sizeof(keywords) / sizeof(keywords[0]))

int tokenCount = 0;
char variables[MAX_LIST_SIZE][MAX_TOKEN_LENGTH], operators[MAX_LIST_SIZE], constants[MAX_LIST_SIZE][MAX_TOKEN_LENGTH], keywordsList[MAX_LIST_SIZE][MAX_TOKEN_LENGTH], specialSymbols[MAX_LIST_SIZE];
int varCount = 0, opCount = 0, constCount = 0, keyCount = 0, specCount = 0;

// Function to check if a string is a keyword
int isKeyword(const char *str) {
    for (int i = 0; i < NUM_KEYWORDS; i++) {
        if (strcmp(str, keywords[i]) == 0) {
            return 1;
        }
    }
    return 0;
}

// Function to recognize tokens
void lexicalAnalyzer(FILE *fp) {
    char ch, buffer[MAX_TOKEN_LENGTH];
    int i = 0;
    
    while ((ch = fgetc(fp)) != EOF) {
        if (isspace(ch)) {
            continue; // Ignore spaces, tabs, and newlines
        } else if (ch == '/') { // Check for comments
            char next = fgetc(fp);
            if (next == '/') { // Single-line comment
                while ((ch = fgetc(fp)) != EOF && ch != '\n');
            } else if (next == '*') { // Multi-line comment
                while ((ch = fgetc(fp)) != EOF) {
                    if (ch == '*' && (ch = fgetc(fp)) == '/') {
                        break;
                    }
                }
            } else {
                ungetc(next, fp);
                tokenCount++;
                operators[opCount++] = ch;
            }
        } else if (isalpha(ch)) { // Identifier or keyword
            i = 0;
            buffer[i++] = ch;
            while ((ch = fgetc(fp)) != EOF && (isalnum(ch) || ch == '_')) {
                buffer[i++] = ch;
            }
            buffer[i] = '\0';
            ungetc(ch, fp);
            tokenCount++;
            if (isKeyword(buffer)) {
                strcpy(keywordsList[keyCount++], buffer);
            } else {
                strcpy(variables[varCount++], buffer);
            }
        } else if (isdigit(ch)) { // Number
            i = 0;
            buffer[i++] = ch;
            while ((ch = fgetc(fp)) != EOF && isdigit(ch)) {
                buffer[i++] = ch;
            }
            buffer[i] = '\0';
            ungetc(ch, fp);
            tokenCount++;
            strcpy(constants[constCount++], buffer);
        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '=' || ch == '<' || ch == '>') { // Operators
            tokenCount++;
            operators[opCount++] = ch;
        } else if (ch == ';' || ch == ',' || ch == '(' || ch == ')' || ch == '{' || ch == '}') { // Special Symbols
            tokenCount++;
            specialSymbols[specCount++] = ch;
        } else {
            tokenCount++;
        }
    }
}

int main() {
    FILE *fp = fopen("input.c", "r");
    if (fp == NULL) {
        printf("Error opening file!\n");
        return 1;
    }
    lexicalAnalyzer(fp);
    fclose(fp);
    
    printf("Keywords: ");
    for (int i = 0; i < keyCount; i++) printf("%s ", keywordsList[i]);
    printf("\nVariables: ");
    for (int i = 0; i < varCount; i++) printf("%s ", variables[i]);
    printf("\nOperators: ");
    for (int i = 0; i < opCount; i++) printf("%c ", operators[i]);
    printf("\nConstants: ");
    for (int i = 0; i < constCount; i++) printf("%s ", constants[i]);
    printf("\nSpecial Symbols: ");
    for (int i = 0; i < specCount; i++) printf("%c ", specialSymbols[i]);
    
    printf("\n\nTotal Tokens: %d\n", tokenCount);
    return 0;
}