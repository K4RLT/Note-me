package f4;

import a7.l;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import q6.s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16717a;

    public h(int i) {
        switch (i) {
            case 1:
                this.f16717a = new ArrayList(20);
                return;
            case 2:
                this.f16717a = new ArrayList();
                return;
            default:
                this.f16717a = new ArrayList();
                new HashMap();
                new HashMap();
                return;
        }
    }

    public void a(String str, String str2) {
        ArrayList arrayList = this.f16717a;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public void b(Path path) {
        ArrayList arrayList = this.f16717a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            Matrix matrix = l.f341a;
            if (sVar != null && !sVar.f23557a) {
                l.a(path, sVar.f23560d.i() / 100.0f, sVar.e.i() / 100.0f, sVar.f23561f.i() / 360.0f);
            }
        }
    }

    public String c(String str) {
        ArrayList arrayList = this.f16717a;
        for (int size = arrayList.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
        }
        return null;
    }

    public List d() {
        ArrayList arrayList;
        if (this.f16717a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f16717a) {
            arrayList = new ArrayList(this.f16717a);
        }
        return arrayList;
    }

    public void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16717a;
            if (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public void f(String str, String str2) {
        ig.l.a(str);
        ig.l.b(str2, str);
        e(str);
        a(str, str2);
    }
}
