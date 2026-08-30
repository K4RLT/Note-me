package r5;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import df.r;
import j.i0;
import q2.e0;
import q2.f0;
import q2.o;
import q2.p;
import q2.s;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24547u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f24548v;

    public /* synthetic */ a(int i, Object obj) {
        this.f24547u = i;
        this.f24548v = obj;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f24547u) {
            case 0:
                q5.d dVar = (q5.d) this.f24548v;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                dVar.f(new i(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                u2.c cVar = (u2.c) this.f24548v;
                f0 b10 = ((q2.j) cVar.f25827y).b((q2.i) obj, (s) obj2, ((o) obj3).f23361a, ((p) obj4).f23362a);
                if (!(b10 instanceof e0)) {
                    i0 i0Var = new i0(b10, cVar.D);
                    cVar.D = i0Var;
                    Object obj5 = i0Var.f18638x;
                    obj5.getClass();
                    return (Typeface) obj5;
                }
                Object obj6 = ((e0) b10).f23343u;
                obj6.getClass();
                return (Typeface) obj6;
        }
    }
}
