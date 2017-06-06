package AddTwoNumbers;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by tsengeagle on 2017/06/06.
 */
public class SolutionTests {

    private final Solution target;

    public SolutionTests() {
        target = new Solution();
    }

    @Test
    public void test_Given_2_3_Should_Return_5() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);

        ListNode expected = new ListNode(5);
        ListNode actual = target.addTwoNumbers(l1, l2);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    public void test_Given_3_3_Should_Return_6() throws Exception {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(3);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(6);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    public void test_Given_9_3_Should_return_2_1() throws Exception {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(3);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    public void test_Given_12_12_Should_Return_24() throws Exception {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(4);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    public void test_Given_243_564_Should_Return_708() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);

    }

    @Test
    public void test_Given_26_34_Should_Return_501() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(6);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(4);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(5);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(1);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    public void test_Given_18_0_Should_Return_18() throws Exception {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);

        ListNode l2 = new ListNode(0);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(8);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    public void test_Given_916_0_Should_Return_916() throws Exception {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(6);

        ListNode l2 = new ListNode(0);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(9);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(6);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }

    @Test
    public void test_Given_1_99_Should_Return_001() throws Exception {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        ListNode actual = target.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(0);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(1);

        assertThat(actual).isEqualToComparingFieldByFieldRecursively(expected);
    }
}
