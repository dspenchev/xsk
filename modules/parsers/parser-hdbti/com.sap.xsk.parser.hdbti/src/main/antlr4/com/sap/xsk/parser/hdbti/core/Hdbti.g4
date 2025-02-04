grammar Hdbti;

importArr: 'import' '=' '[' (objConfig (',' objConfig)*)? ']' ';';

objConfig: '{'
                assignExpression*
            '}';

assignExpression: assignTable | assignSchema | assignFile | assignHeader | assignUseHeaderNames | assignDelimField | assignDelimEnclosing | assignDistinguishEmptyFromNull | assignKeys;
assignTable: 'table' '=' STRING ';';
assignSchema: 'schema' '=' STRING ';';
assignFile: 'file' '=' STRING ';';
assignHeader: 'header' '=' BOOLEAN ';';
assignUseHeaderNames: 'useHeaderNames' '=' BOOLEAN ';';
assignDelimField: 'delimField' '=' STRING ';';
assignDelimEnclosing: 'delimEnclosing' '=' STRING ';';
assignDistinguishEmptyFromNull: 'distinguishEmptyFromNull' '=' BOOLEAN ';';
assignKeys: 'keys' '=' keyArr;

keyArr: '[' (pair (',' pair)*)? ']' ';';
pair: pairKey ':' pairValue;
pairKey: STRING;
pairValue: STRING;

STRING:     '"' (~["\\\r\n] | EscapeSequence)* '"';
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;

BOOLEAN: TRUE | FALSE;

TRUE: 'true';
FALSE: 'false';

WS  :   [ \t\\]+ -> skip ; // toss out whitespace
RB: '[';
LB: ']';
EQ: '=';
