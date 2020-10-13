package annotation;

public @interface TestInfo {
    int         count();
    String      testBy();
    String[]    testTools();
    TestType    testType();
    DateTime    testDate();
}

enum TestType { FIRST, FINAL }

@interface DateTime {
    String yymmdd();
    String hhmmss();
}