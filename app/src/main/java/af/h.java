package af;

import java.io.File;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class h extends qe.b {

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f373w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f374x;

    public h(j jVar) {
        this.f374x = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f373w = arrayDeque;
        File file = (File) jVar.f377b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            file.getClass();
            arrayDeque.push(new i(file));
        } else {
            this.f24004u = 2;
        }
    }

    @Override // qe.b
    public final void a() {
        File file;
        File a10;
        while (true) {
            ArrayDeque arrayDeque = this.f373w;
            i iVar = (i) arrayDeque.peek();
            if (iVar == null) {
                file = null;
                break;
            }
            a10 = iVar.a();
            if (a10 == null) {
                arrayDeque.pop();
            } else if (a10.equals(iVar.f375a) || !a10.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(b(a10));
            }
        }
        file = a10;
        if (file != null) {
            this.f24005v = file;
            this.f24004u = 1;
        } else {
            this.f24004u = 2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [af.d, af.i] */
    /* JADX WARN: Type inference failed for: r0v5, types: [af.d, af.i] */
    public final d b(File file) {
        int ordinal = ((k) this.f374x.f378c).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                file.getClass();
                return new i(file);
            }
            l4.a.o();
            return null;
        }
        file.getClass();
        return new i(file);
    }
}
