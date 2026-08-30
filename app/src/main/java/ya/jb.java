package ya;
import x.n;
import q.x;
import rf.a;
import rf.h;
import rf.k;
import rf.l;
import rf.r;

/* loaded from: classes.dex */
public abstract class jb {
    public static h a(int i, int i10, a aVar) {
        if ((i10 & 1) != 0) {
            i = 0;
        }
        int i11 = i10 & 2;
        a aVar2 = a.f24769u;
        if (i11 != 0) {
            aVar = aVar2;
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (aVar == aVar2) {
                            return new h(i);
                        }
                        return new r(i, aVar);
                    }
                    return new h(Integer.MAX_VALUE);
                }
                if (aVar == aVar2) {
                    return new h(0);
                }
                return new r(1, aVar);
            }
            if (aVar == aVar2) {
                return new r(1, a.f24770v);
            }
            x.n("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (aVar == aVar2) {
            l.f24810t.getClass();
            return new h(k.f24809b);
        }
        return new r(1, aVar);
    }
}
