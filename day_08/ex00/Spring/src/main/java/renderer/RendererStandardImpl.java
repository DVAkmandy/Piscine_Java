package renderer;

import preprocessor.PreProcessor;

public class RendererStandardImpl implements Renderer{
    PreProcessor preProcessor;

    public RendererStandardImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void outputs(String textStr) {
        System.out.println(preProcessor.preProcess(textStr));
    }
}
