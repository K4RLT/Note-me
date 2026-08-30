package wa;
import x.j;
import x.n;
import l.a;
import q.x;

/* loaded from: classes.dex */
public abstract class p6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [fg.c, fg.s] */
    /* JADX WARN: Type inference failed for: r1v0, types: [fg.h, java.lang.Object] */
    public static fg.s a(df.l lVar) {
        fg.b bVar = fg.c.f16964d;
        bVar.getClass();
        Object obj = new Object();
        fg.j jVar = bVar.f16965a;
        obj.f16976a = jVar.f16983a;
        obj.f16977b = jVar.f16986d;
        obj.f16978c = jVar.f16984b;
        obj.f16979d = jVar.f16985c;
        String str = jVar.e;
        obj.e = str;
        obj.f16980f = jVar.f16987f;
        obj.f16981g = jVar.f16989h;
        obj.f16982h = jVar.f16988g;
        obj.i = bVar.f16966b;
        lVar.invoke(obj);
        if (!obj.f16979d) {
            if (!kotlin.jvm.internal.a(str, "    ")) {
                x.n("Indent should not be specified when default printing mode is used");
                return null;
            }
        } else if (!kotlin.jvm.internal.a(str, "    ")) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    x.j("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                    return null;
                }
            }
        }
        fg.j jVar2 = new fg.j(obj.f16976a, obj.f16978c, obj.f16979d, obj.f16977b, obj.e, obj.f16980f, obj.f16982h, obj.f16981g);
        eb.y yVar = obj.i;
        yVar.getClass();
        return new fg.c(jVar2, yVar);
    }
}