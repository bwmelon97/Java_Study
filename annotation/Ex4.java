package annotation;

@TestInfo(
    count = 3, testBy = "Soogeun",
    testTools = {"JUnit", "AutoTester"},
    testType = TestType.FIRST,
    testDate = @DateTime(yymmdd = "201013", hhmmss = "222510")
)
public class Ex4 {
    
}