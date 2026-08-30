package we;

import java.io.Serializable;
import java.util.RandomAccess;
import q.x;
import qe.e;
import qe.k;
import w7.i1;

/* loaded from: classes.dex */
public final class b extends e implements a, RandomAccess, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Enum[] f29894u;

    public b(Enum[] enumArr) {
        enumArr.getClass();
        this.f29894u = enumArr;
    }

    @Override // qe.a
    public final int a() {
        return this.f29894u.length;
    }

    @Override // qe.a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        if (((Enum) k.o(this.f29894u, r42.ordinal())) != r42) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f29894u;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        x.l(i1.c("index: ", i, length, ", size: "));
        return null;
    }

    @Override // qe.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (((Enum) k.o(this.f29894u, ordinal)) != r42) {
            return -1;
        }
        return ordinal;
    }

    @Override // qe.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (((Enum) k.o(this.f29894u, ordinal)) != r42) {
            return -1;
        }
        return ordinal;
    }
}
