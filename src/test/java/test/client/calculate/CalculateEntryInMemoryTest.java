package test.client.calculate;

import io.client.calculate.CalculateEntry;
import io.client.calculate.CalculateEntryInMemory;
import io.client.calculate.Operation;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateEntryInMemoryTest {
    @Test
    public void add() throws Exception {
        CalculateEntryInMemory repo = new CalculateEntryInMemory();

        CalculateEntry createdCalculateEntry = repo.add(1,2);

        CalculateEntry expected = new CalculateEntry(1, 1, 2, 3, Operation.OperationType.ADDITION);
        assertThat(createdCalculateEntry).isEqualTo(expected);
    }

    @Test
    public void subtract() throws Exception {
        CalculateEntryInMemory repo = new CalculateEntryInMemory();

        CalculateEntry createdCalculateEntry = repo.subtract(2,1);

        CalculateEntry expected = new CalculateEntry(1, 2, 1, 1, Operation.OperationType.SUBTRACTION);
        assertThat(createdCalculateEntry).isEqualTo(expected);
    }

    @Test
    public void multiply() throws Exception {
        CalculateEntryInMemory repo = new CalculateEntryInMemory();

        CalculateEntry createdCalculateEntry = repo.multiply(2,1);

        CalculateEntry expected = new CalculateEntry(1, 2, 1, 2, Operation.OperationType.MULTIPLICATION);
        assertThat(createdCalculateEntry).isEqualTo(expected);
    }

    @Test
    public void divide() throws Exception {
        CalculateEntryInMemory repo = new CalculateEntryInMemory();

        CalculateEntry createdCalculateEntry = repo.divide(10,5);

        CalculateEntry expected = new CalculateEntry(1, 10, 5, 2, Operation.OperationType.DIVISION);
        assertThat(createdCalculateEntry).isEqualTo(expected);
    }
}
