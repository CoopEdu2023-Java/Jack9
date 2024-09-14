
// 基类 Sports
public class Sports {
    // play 方法
    public void play() {
        System.out.println("Playing some sport...");
    }
}

// 子类 Football
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

// 子类 Basketball
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

// 子类 Rugby
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Rugby");
    }
}

