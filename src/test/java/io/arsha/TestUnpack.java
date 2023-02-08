package io.arsha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class TestUnpack {

    @Test
    public void testUnpack() {
        try {
            String test = "81000000000000000B000000060000002D000000090000003000000003000000310000000300000032000000020000003300000002000000340000000600000035000000030000003700000004000000380000000100000039000000020000007C000000850000001100000029000000D30C7890FB1D0E6E4B4C35DF1775BDAA90";
            byte[] hex = Hex.decodeHex(test);

            String decoded = HuffmanDecoder.decode(hex);
            assertEquals(decoded, "53801-198-55428-4050|53802-0-17725-70000|");
        } catch (DecoderException e) {
            e.printStackTrace();
        }
    }
}
