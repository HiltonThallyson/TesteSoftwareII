import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0First {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.example.TodoList todoList0 = new org.example.TodoList();
        java.lang.Class<?> wildcardClass1 = todoList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = myTask2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass3 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask10 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = myTask6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.addTask(myTask1);
        java.lang.Class<?> wildcardClass3 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.addTask(myTask1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask4 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        java.lang.Class<?> wildcardClass3 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        java.lang.Class<?> wildcardClass5 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        java.lang.Class<?> wildcardClass4 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = myTask12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask14 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = myTask4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask16 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask6 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask19 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask16 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.addTask(myTask6);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.addTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask6 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = myTask13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = myTask16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask10 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = myTask10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass8 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = myTask20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.addTask(myTask1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask4 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask10 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass6 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass5 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.addTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask8 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("hi!");
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask24 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask19 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = myTask13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask6 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = myTask6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass5 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        todoList0.printList();
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask14 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.addTask(myTask1);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask21 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = myTask15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = myTask11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass8 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask7 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = myTask7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertNull(myTask7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask18 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask21 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertNull(myTask21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = myTask11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask15 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask16 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        java.lang.Class<?> wildcardClass24 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask16 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask17 = todoList0.getTask("");
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = myTask8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.addTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask19 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        todoList0.printList();
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        todoList0.printList();
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask17 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask13 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        todoList0.printList();
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        java.lang.Class<?> wildcardClass8 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.removeTask(myTask21);
        java.lang.Class<?> wildcardClass23 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        java.lang.Class<?> wildcardClass21 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask23 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = myTask10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNull(myTask10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        todoList0.printList();
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask14 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask17 = todoList0.getTask("");
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask6 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.example.TodoList todoList0 = new org.example.TodoList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        java.lang.Class<?> wildcardClass5 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = myTask9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask15 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        java.lang.Class<?> wildcardClass5 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask13 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = myTask15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask13 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask25 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        todoList0.printList();
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask23 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.addTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask11 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask15 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        todoList0.printList();
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        todoList0.printList();
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask18 = todoList0.getTask("");
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask22 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        todoList0.printList();
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        todoList0.printList();
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask21 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask18 = todoList0.getTask("");
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.removeTask(myTask21);
        java.lang.Class<?> wildcardClass23 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask17 = todoList0.getTask("");
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask21 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.removeTask(myTask24);
        org.example.MyTask myTask26 = null;
        boolean boolean27 = todoList0.removeTask(myTask26);
        java.lang.Class<?> wildcardClass28 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask21 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass26 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask27 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask15 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask18 = todoList0.getTask("hi!");
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask22 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        todoList0.printList();
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        todoList0.printList();
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        java.lang.Class<?> wildcardClass24 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask20 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = myTask15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("hi!");
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask17 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = myTask17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(myTask17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask15 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        org.example.MyTask myTask4 = null;
        boolean boolean5 = todoList0.removeTask(myTask4);
        java.lang.Class<?> wildcardClass6 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass21 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass8 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        org.example.MyTask myTask26 = null;
        boolean boolean27 = todoList0.addTask(myTask26);
        java.lang.Class<?> wildcardClass28 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask18 = todoList0.getTask("");
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask4 = null;
        boolean boolean5 = todoList0.removeTask(myTask4);
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = myTask7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(myTask7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask17 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        java.lang.Class<?> wildcardClass21 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("hi!");
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask24 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        org.example.MyTask myTask4 = null;
        boolean boolean5 = todoList0.removeTask(myTask4);
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.addTask(myTask6);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask9 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask17 = todoList0.getTask("");
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("");
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        java.lang.Class<?> wildcardClass23 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        org.example.MyTask myTask4 = null;
        boolean boolean5 = todoList0.addTask(myTask4);
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.addTask(myTask6);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask9 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.removeTask(myTask21);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass25 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        todoList0.printList();
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask22 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = myTask11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask17 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        org.example.MyTask myTask16 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask21 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask23 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask25 = null;
        boolean boolean26 = todoList0.removeTask(myTask25);
        org.example.MyTask myTask27 = null;
        boolean boolean28 = todoList0.addTask(myTask27);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(myTask23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask8 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = myTask8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(myTask8);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask17 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        org.example.MyTask myTask12 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask19 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask10 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = myTask10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNull(myTask10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        todoList0.printList();
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask14 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = myTask11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask13 = todoList0.getTask("");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        todoList0.printList();
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        todoList0.printList();
        java.lang.Class<?> wildcardClass25 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask11 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        org.example.MyTask myTask21 = todoList0.getTask("");
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(myTask21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask13 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        org.example.MyTask myTask21 = todoList0.getTask("hi!");
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        java.lang.Class<?> wildcardClass26 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(myTask21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        org.example.MyTask myTask22 = todoList0.getTask("");
        org.example.MyTask myTask24 = todoList0.getTask("hi!");
        org.example.MyTask myTask25 = null;
        boolean boolean26 = todoList0.addTask(myTask25);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(myTask22);
        org.junit.Assert.assertNull(myTask24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask18 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        todoList0.printList();
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask14 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask18 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = myTask18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(myTask18);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = myTask5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("");
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass21 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("");
        org.example.MyTask myTask22 = todoList0.getTask("hi!");
        org.example.MyTask myTask23 = null;
        boolean boolean24 = todoList0.removeTask(myTask23);
        org.example.MyTask myTask25 = null;
        boolean boolean26 = todoList0.removeTask(myTask25);
        java.lang.Class<?> wildcardClass27 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertNull(myTask22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask13 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = myTask13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask18 = todoList0.getTask("");
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        todoList0.printList();
        org.example.MyTask myTask23 = todoList0.getTask("hi!");
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        java.lang.Class<?> wildcardClass26 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(myTask23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        org.example.MyTask myTask21 = todoList0.getTask("hi!");
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask27 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(myTask21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask19 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask4 = null;
        boolean boolean5 = todoList0.removeTask(myTask4);
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass8 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask11 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask13 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask23 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask18 = todoList0.getTask("");
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        java.lang.Class<?> wildcardClass7 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask8 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask17 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = myTask6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask19 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask14 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask17 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask17 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("");
        org.example.MyTask myTask22 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass23 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertNull(myTask22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask8 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask13 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.removeTask(myTask21);
        todoList0.printList();
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.removeTask(myTask24);
        java.lang.Class<?> wildcardClass26 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        todoList0.printList();
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        todoList0.printList();
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        todoList0.printList();
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        java.lang.Class<?> wildcardClass5 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("hi!");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        org.example.MyTask myTask23 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask25 = null;
        boolean boolean26 = todoList0.removeTask(myTask25);
        org.example.MyTask myTask27 = null;
        boolean boolean28 = todoList0.addTask(myTask27);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask30 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(myTask23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = myTask11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        todoList0.printList();
        java.lang.Class<?> wildcardClass21 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask20 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask12 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass13 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask8 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask10 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = myTask11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask21 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask23 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.removeTask(myTask21);
        todoList0.printList();
        java.lang.Class<?> wildcardClass24 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        org.example.MyTask myTask4 = null;
        boolean boolean5 = todoList0.addTask(myTask4);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask7 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        todoList0.printList();
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        todoList0.printList();
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask17 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = myTask17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(myTask17);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = myTask17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        todoList0.printList();
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("hi!");
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        java.lang.Class<?> wildcardClass23 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask20 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        org.example.MyTask myTask4 = null;
        boolean boolean5 = todoList0.removeTask(myTask4);
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.addTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        java.lang.Class<?> wildcardClass10 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        todoList0.printList();
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        org.example.MyTask myTask20 = todoList0.getTask("hi!");
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        java.lang.Class<?> wildcardClass23 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask18 = todoList0.getTask("");
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        todoList0.printList();
        org.example.MyTask myTask23 = todoList0.getTask("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = myTask23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(myTask23);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask8 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.example.TodoList todoList0 = new org.example.TodoList();
        todoList0.printList();
        org.example.MyTask myTask2 = null;
        boolean boolean3 = todoList0.addTask(myTask2);
        java.lang.Class<?> wildcardClass4 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        todoList0.printList();
        org.example.MyTask myTask19 = todoList0.getTask("");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.removeTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask13 = todoList0.getTask("");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask17 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("hi!");
        todoList0.printList();
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = todoList0.getTask("");
        todoList0.printList();
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass18 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.example.TodoList todoList0 = new org.example.TodoList();
        todoList0.printList();
        org.example.MyTask myTask2 = null;
        boolean boolean3 = todoList0.addTask(myTask2);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask5 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("");
        org.example.MyTask myTask15 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = todoList0.getTask("");
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask21 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNull(myTask17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        todoList0.printList();
        org.example.MyTask myTask21 = todoList0.getTask("hi!");
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.addTask(myTask22);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask25 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(myTask21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.addTask(myTask3);
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        org.example.MyTask myTask13 = todoList0.getTask("");
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        todoList0.printList();
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask18 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(myTask18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        java.lang.Class<?> wildcardClass20 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask19 = todoList0.getTask("");
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(myTask19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        todoList0.printList();
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.removeTask(myTask21);
        org.example.MyTask myTask23 = null;
        boolean boolean24 = todoList0.addTask(myTask23);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask26 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.removeTask(myTask5);
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        java.lang.Class<?> wildcardClass11 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        todoList0.printList();
        todoList0.printList();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.addTask(myTask8);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        java.lang.Class<?> wildcardClass19 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask15 = todoList0.getTask("");
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.addTask(myTask16);
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.addTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        org.example.MyTask myTask22 = null;
        boolean boolean23 = todoList0.removeTask(myTask22);
        org.example.MyTask myTask24 = null;
        boolean boolean25 = todoList0.addTask(myTask24);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask27 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.addTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        // The following exception was thrown during execution in test generation
        try {
            todoList0.printList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTaskInformation()\" because \"printTask\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = todoList0.getTask("hi!");
        org.example.MyTask myTask15 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.addTask(myTask17);
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.removeTask(myTask19);
        java.lang.Class<?> wildcardClass21 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask13);
        org.junit.Assert.assertNull(myTask15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("");
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass12 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        todoList0.printList();
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.removeTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.removeTask(myTask15);
        todoList0.printList();
        org.example.MyTask myTask18 = null;
        boolean boolean19 = todoList0.removeTask(myTask18);
        org.example.MyTask myTask20 = null;
        boolean boolean21 = todoList0.addTask(myTask20);
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        org.example.MyTask myTask16 = null;
        boolean boolean17 = todoList0.removeTask(myTask16);
        todoList0.printList();
        org.example.MyTask myTask19 = null;
        boolean boolean20 = todoList0.addTask(myTask19);
        org.example.MyTask myTask21 = null;
        boolean boolean22 = todoList0.addTask(myTask21);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask24 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask5 = null;
        boolean boolean6 = todoList0.addTask(myTask5);
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        java.lang.Class<?> wildcardClass14 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        org.example.MyTask myTask9 = todoList0.getTask("hi!");
        org.example.MyTask myTask11 = todoList0.getTask("hi!");
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        org.example.MyTask myTask17 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = myTask17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(myTask9);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(myTask17);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("hi!");
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.addTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        todoList0.printList();
        java.lang.Class<?> wildcardClass17 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        todoList0.printList();
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.removeTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.addTask(myTask14);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask17 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask4 = todoList0.getTask("");
        org.example.MyTask myTask6 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = todoList0.getTask("hi!");
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = myTask12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertNull(myTask12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask5 = todoList0.getTask("");
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask10 = null;
        boolean boolean11 = todoList0.removeTask(myTask10);
        org.example.MyTask myTask12 = null;
        boolean boolean13 = todoList0.addTask(myTask12);
        org.example.MyTask myTask14 = null;
        boolean boolean15 = todoList0.removeTask(myTask14);
        java.lang.Class<?> wildcardClass16 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.addTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        todoList0.printList();
        org.example.MyTask myTask8 = todoList0.getTask("hi!");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.addTask(myTask9);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask12 = todoList0.getTask("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask8 = todoList0.getTask("");
        org.example.MyTask myTask9 = null;
        boolean boolean10 = todoList0.removeTask(myTask9);
        org.example.MyTask myTask12 = todoList0.getTask("hi!");
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        java.lang.Class<?> wildcardClass15 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertNull(myTask8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(myTask12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        org.example.MyTask myTask6 = todoList0.getTask("");
        org.example.MyTask myTask7 = null;
        boolean boolean8 = todoList0.removeTask(myTask7);
        org.example.MyTask myTask10 = todoList0.getTask("");
        org.example.MyTask myTask11 = null;
        boolean boolean12 = todoList0.removeTask(myTask11);
        org.example.MyTask myTask13 = null;
        boolean boolean14 = todoList0.addTask(myTask13);
        org.example.MyTask myTask15 = null;
        boolean boolean16 = todoList0.addTask(myTask15);
        // The following exception was thrown during execution in test generation
        try {
            org.example.MyTask myTask18 = todoList0.getTask("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.MyTask.getTitle()\" because \"task\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(myTask6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(myTask10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask1 = null;
        boolean boolean2 = todoList0.removeTask(myTask1);
        org.example.MyTask myTask3 = null;
        boolean boolean4 = todoList0.removeTask(myTask3);
        todoList0.printList();
        org.example.MyTask myTask6 = null;
        boolean boolean7 = todoList0.removeTask(myTask6);
        todoList0.printList();
        java.lang.Class<?> wildcardClass9 = todoList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.example.TodoList todoList0 = new org.example.TodoList();
        org.example.MyTask myTask2 = todoList0.getTask("");
        org.example.MyTask myTask4 = todoList0.getTask("hi!");
        todoList0.printList();
        org.example.MyTask myTask7 = todoList0.getTask("hi!");
        org.example.MyTask myTask8 = null;
        boolean boolean9 = todoList0.removeTask(myTask8);
        org.example.MyTask myTask11 = todoList0.getTask("");
        todoList0.printList();
        org.example.MyTask myTask14 = todoList0.getTask("");
        org.example.MyTask myTask16 = todoList0.getTask("hi!");
        org.example.MyTask myTask17 = null;
        boolean boolean18 = todoList0.removeTask(myTask17);
        todoList0.printList();
        org.example.MyTask myTask21 = todoList0.getTask("");
        java.lang.Class<?> wildcardClass22 = todoList0.getClass();
        org.junit.Assert.assertNull(myTask2);
        org.junit.Assert.assertNull(myTask4);
        org.junit.Assert.assertNull(myTask7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(myTask11);
        org.junit.Assert.assertNull(myTask14);
        org.junit.Assert.assertNull(myTask16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(myTask21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

