package preprocessor;

public class PreProcessorToLower implements PreProcessor{
    @Override
    public String preProcess(String str) {
        return str.toLowerCase();
    }
}
