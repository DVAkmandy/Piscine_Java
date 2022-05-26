package renderer;

import preprocessor.PreProcessor;

public class RendererErrImpl implements Renderer{
    PreProcessor preProcessor;

    public RendererErrImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void outputs(String textStr) {
        System.err.println(preProcessor.preProcess(textStr));
    }
}
