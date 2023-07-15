abstract class Processor {
    
    private Processor nextProcessor;

    public Processor(Processor nexProcessor) {
        this.nextProcessor = nexProcessor;
    }

    public void process(Number request) {
        if (nextProcessor != null) {
            nextProcessor.process(request);
        }
    }
}
