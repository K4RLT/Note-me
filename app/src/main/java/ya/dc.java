package ya;
import mf.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class dc {
    public static sg.h a(String str) {
        str.getClass();
        char[] cArr = tg.a.f25759a;
        byte[] bytes = str.getBytes(a.f20798a);
        bytes.getClass();
        sg.h hVar = new sg.h(bytes);
        hVar.f25278v = str;
        return hVar;
    }

    public static sg.h b(byte... bArr) {
        bArr.getClass();
        char[] cArr = tg.a.f25759a;
        return new sg.h(Arrays.copyOf(bArr, bArr.length));
    }
}
