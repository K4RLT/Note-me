package jc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, v8.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19127u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f19128v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f19129w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19130x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f19131y;

    public /* synthetic */ b(com.google.android.gms.internal.consent_sdk.c cVar, Iterable iterable, n8.i iVar, long j10) {
        this.f19127u = 2;
        this.f19128v = cVar;
        this.f19131y = iterable;
        this.f19130x = iVar;
        this.f19129w = j10;
    }

    @Override // jc.g
    public ScheduledFuture a(ic.c cVar) {
        switch (this.f19127u) {
            case 0:
                f fVar = (f) this.f19128v;
                Runnable runnable = (Runnable) this.f19131y;
                return fVar.f19146v.schedule(new e(fVar, runnable, cVar, 1), this.f19129w, (TimeUnit) this.f19130x);
            default:
                f fVar2 = (f) this.f19128v;
                Callable callable = (Callable) this.f19131y;
                return fVar2.f19146v.schedule(new b6.e(1, fVar2, callable, cVar), this.f19129w, (TimeUnit) this.f19130x);
        }
    }

    @Override // v8.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f19128v;
        Iterable iterable = (Iterable) this.f19131y;
        n8.i iVar = (n8.i) this.f19130x;
        u8.f fVar = (u8.f) cVar.f13373x;
        fVar.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(u8.f.r(iterable));
            SQLiteDatabase f10 = fVar.f();
            f10.beginTransaction();
            try {
                f10.compileStatement(concat).execute();
                Cursor rawQuery = f10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        fVar.o(rawQuery.getInt(0), q8.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                f10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                f10.setTransactionSuccessful();
            } finally {
                f10.endTransaction();
            }
        }
        fVar.k(new u8.c(((w8.a) cVar.B).e() + this.f19129w, iVar));
        return null;
    }

    public /* synthetic */ b(f fVar, Object obj, long j10, TimeUnit timeUnit, int i) {
        this.f19127u = i;
        this.f19128v = fVar;
        this.f19131y = obj;
        this.f19129w = j10;
        this.f19130x = timeUnit;
    }
}
