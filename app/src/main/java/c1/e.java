package c1;

import java.util.List;
import qe.m;
import qe.y;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: u, reason: collision with root package name */
    public final List f3448u;

    public e(List list) {
        this.f3448u = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        re.b e = m.e();
        List list = this.f3448u;
        list.getClass();
        y yVar = new y(list);
        if (yVar.a() <= 0) {
            re.b c10 = m.c(e);
            c10.getClass();
            y yVar2 = new y(c10);
            int a10 = yVar2.a();
            for (int i = 0; i < a10; i++) {
                sb2.append("\tat " + ((String) yVar2.get(i)));
                sb2.append('\n');
            }
            return sb2.toString();
        }
        ((b) yVar.get(0)).getClass();
        throw null;
    }
}
