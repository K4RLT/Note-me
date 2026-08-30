package xa;
import x.o;
import q.x;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class i2 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f30430c = new j1(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30431a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f30432b;

    public /* synthetic */ i2(i0 i0Var, int i) {
        this.f30431a = i;
        this.f30432b = i0Var;
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        switch (this.f30431a) {
            case 0:
                Date date = (Date) this.f30432b.a(l2Var);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) this.f30432b.a(l2Var)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                l2Var.R();
                while (l2Var.a0()) {
                    arrayList.add(Long.valueOf(((Number) this.f30432b.a(l2Var)).longValue()));
                }
                l2Var.W();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            case 3:
                i0 i0Var = this.f30432b;
                if (i0Var != null) {
                    return i0Var.a(l2Var);
                }
                x.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                return null;
            default:
                return this.f30432b.a(l2Var);
        }
    }
}
