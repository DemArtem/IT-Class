package _Java.IT_Class.M24_Patterns;

/*
Стратегия - общий, недетализированный план, охватывающий длительный период времени,
способ достижения сложной цели, в военном деле, позднее вообще какой-либо деятельности человека.
 */
//Strategy
public class Strategy_Calculator {
    public static void main(String[] args) {
        Context context = new Context(new AddOperator());
        System.out.println(context.execute(1, 2));
        context = new Context(new NegativeOperator());
        System.out.println(context.execute(1));
    }
}

interface Strategy {
    int doOperation(int a); //Унарный оператор
    int doOperation(int a, int b); //Бинарный оператор
}

class AddOperator implements Strategy {
    @Override
    public int doOperation(int a) {
        return 0;
    }

    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}

class SubtractOperator implements Strategy {
    @Override
    public int doOperation(int a) {
        return 0;
    }

    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}

class NegativeOperator implements Strategy {
    @Override
    public int doOperation(int a) {
        return -a;
    }

    @Override
    public int doOperation(int a, int b) {
        return 0;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a) {
        return strategy.doOperation(a);
    }

    public int execute(int a, int b) {
        return strategy.doOperation(a, b);
    }
}