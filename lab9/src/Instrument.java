class Instrument {
    String name;

    Instrument(String name) {
        this.name = name;
    }

    void playSound() {
        System.out.println("Instrument makes a sound...");
    }
}

class Guitar extends Instrument {
    Guitar(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + ": distorted riff starts playing");
    }
}

class Piano extends Instrument {
    Piano(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + ": soft melody plays");
    }
}

class Drums extends Instrument {
    Drums(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + ": aggressive drum beat");
    }
}
