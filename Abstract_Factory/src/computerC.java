class computerC extends computerFactory{

    private String resolution;
    private double res_width;
    private double res_height;
    public computerC()
    {
        this.resolution="550 X 430";
        this.res_width=550;
        this.res_height=430;
    }

    public String getResolution() {
        return resolution;
    }

    public double getRes_width() {
        return res_width;
    }

    public double getRes_height() {
        return res_height;
    }

    public String getName() {
        return "COMPUTER-C";
    }

    @Override
    public cpu getCpu() {
        return new cpuC();
    }
    @Override
    public mmu getMmu() {
        return new mmuC();
    }
}

