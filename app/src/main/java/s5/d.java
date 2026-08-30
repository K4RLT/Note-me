package s5;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
import q.x;
import r5.j;
import ya.n9;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24918x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final Object f24919y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r5.c cVar, String str) {
        super(cVar, str);
        cVar.getClass();
        str.getClass();
        this.f24919y = cVar.k(str);
    }

    @Override // p5.c
    public final String D(int i) {
        switch (this.f24918x) {
            case 0:
                return ((e) this.f24919y).D(i);
            case 1:
                f();
                n9.b(21, "no row");
                throw null;
            default:
                f();
                n9.b(21, "no row");
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, pe.g] */
    @Override // p5.c
    public final boolean P() {
        switch (this.f24918x) {
            case 0:
                e eVar = (e) this.f24919y;
                boolean P = eVar.P();
                boolean equalsIgnoreCase = eVar.D(0).equalsIgnoreCase("wal");
                r5.c cVar = this.f24923u;
                if (equalsIgnoreCase) {
                    cVar.f24554u.enableWriteAheadLogging();
                } else {
                    cVar.f24554u.disableWriteAheadLogging();
                }
                return P;
            case 1:
                f();
                ((j) this.f24919y).f24578v.execute();
                return false;
            default:
                int ordinal = ((c) this.f24919y).ordinal();
                r5.c cVar2 = this.f24923u;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    SQLiteDatabase sQLiteDatabase = cVar2.f24554u;
                                    Object r32 = r5.c.f24553y;
                                    if (((Method) r32.getValue()) != null) {
                                        Object r42 = r5.c.f24552x;
                                        if (((Method) r42.getValue()) != null) {
                                            Method method = (Method) r32.getValue();
                                            method.getClass();
                                            Method method2 = (Method) r42.getValue();
                                            method2.getClass();
                                            Object invoke = method2.invoke(sQLiteDatabase, null);
                                            if (invoke != null) {
                                                method.invoke(invoke, 0, null, 0, null);
                                                return false;
                                            }
                                            x.o("Required value was null.");
                                            return false;
                                        }
                                    }
                                    cVar2.f();
                                    return false;
                                }
                                l4.a.o();
                                return false;
                            }
                            cVar2.j();
                            return false;
                        }
                        cVar2.f();
                        return false;
                    }
                    cVar2.m();
                    return false;
                }
                cVar2.w();
                cVar2.m();
                return false;
        }
    }

    @Override // p5.c
    public final void b(int i, long j10) {
        switch (this.f24918x) {
            case 0:
                ((e) this.f24919y).b(i, j10);
                return;
            case 1:
                f();
                ((j) this.f24919y).b(i, j10);
                return;
            default:
                f();
                n9.b(25, "column index out of range");
                throw null;
        }
    }

    @Override // p5.c
    public final void c(double d2, int i) {
        switch (this.f24918x) {
            case 0:
                ((e) this.f24919y).c(d2, i);
                return;
            case 1:
                f();
                ((j) this.f24919y).c(d2, i);
                return;
            default:
                f();
                n9.b(25, "column index out of range");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f24918x) {
            case 0:
                ((e) this.f24919y).close();
                return;
            case 1:
                ((j) this.f24919y).close();
                this.f24925w = true;
                return;
            default:
                this.f24925w = true;
                return;
        }
    }

    @Override // p5.c
    public final void g(int i) {
        switch (this.f24918x) {
            case 0:
                ((e) this.f24919y).g(i);
                return;
            case 1:
                f();
                ((j) this.f24919y).g(i);
                return;
            default:
                f();
                n9.b(25, "column index out of range");
                throw null;
        }
    }

    @Override // p5.c
    public final int getColumnCount() {
        switch (this.f24918x) {
            case 0:
                return ((e) this.f24919y).getColumnCount();
            case 1:
                f();
                return 0;
            default:
                f();
                return 0;
        }
    }

    @Override // p5.c
    public final String getColumnName(int i) {
        switch (this.f24918x) {
            case 0:
                return ((e) this.f24919y).getColumnName(i);
            case 1:
                f();
                n9.b(21, "no row");
                throw null;
            default:
                f();
                n9.b(21, "no row");
                throw null;
        }
    }

    @Override // p5.c
    public final double getDouble(int i) {
        switch (this.f24918x) {
            case 0:
                return ((e) this.f24919y).getDouble(i);
            case 1:
                f();
                n9.b(21, "no row");
                throw null;
            default:
                f();
                n9.b(21, "no row");
                throw null;
        }
    }

    @Override // p5.c
    public final long getLong(int i) {
        switch (this.f24918x) {
            case 0:
                return ((e) this.f24919y).getLong(i);
            case 1:
                f();
                n9.b(21, "no row");
                throw null;
            default:
                f();
                n9.b(21, "no row");
                throw null;
        }
    }

    @Override // s5.f, p5.c
    public void h() {
        switch (this.f24918x) {
            case 0:
                ((e) this.f24919y).h();
                return;
            case 1:
                f();
                ((j) this.f24919y).h();
                return;
            default:
                super.h();
                return;
        }
    }

    @Override // p5.c
    public final boolean isNull(int i) {
        switch (this.f24918x) {
            case 0:
                return ((e) this.f24919y).isNull(i);
            case 1:
                f();
                n9.b(21, "no row");
                throw null;
            default:
                f();
                n9.b(21, "no row");
                throw null;
        }
    }

    @Override // s5.f, p5.c
    public void reset() {
        switch (this.f24918x) {
            case 0:
                ((e) this.f24919y).reset();
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // p5.c
    public final void s(int i, String str) {
        switch (this.f24918x) {
            case 0:
                str.getClass();
                ((e) this.f24919y).s(i, str);
                return;
            case 1:
                str.getClass();
                f();
                ((j) this.f24919y).n(i, str);
                return;
            default:
                str.getClass();
                f();
                n9.b(25, "column index out of range");
                throw null;
        }
    }

    @Override // p5.c
    public boolean u() {
        switch (this.f24918x) {
            case 0:
                return ((e) this.f24919y).u();
            default:
                return super.u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r5.c cVar, String str, e eVar) {
        super(cVar, str);
        cVar.getClass();
        str.getClass();
        this.f24919y = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r5.c cVar, String str, c cVar2) {
        super(cVar, str);
        cVar.getClass();
        str.getClass();
        this.f24919y = cVar2;
    }
}