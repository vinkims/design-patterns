class Main {
    
    public static void main(String[] args) {

        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        // Pass the displays to Cricket Data
        CricketData cricketData = new CricketData();

        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        cricketData.dataChanged();

        // remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        cricketData.dataChanged();
    }
}
