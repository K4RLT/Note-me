package lc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import ib.o;
import java.util.HashMap;
import n8.i;
import qc.j1;
import u8.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements gd.a, ib.a, v8.b, u8.d {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f20320u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f20321v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f20322w;

    public /* synthetic */ a(Object obj, long j10, Object obj2) {
        this.f20321v = obj;
        this.f20320u = j10;
        this.f20322w = obj2;
    }

    @Override // u8.d
    public Object apply(Object obj) {
        boolean z3;
        String str = (String) this.f20321v;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((q8.c) this.f20322w).f23596u;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            if (rawQuery.getCount() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            rawQuery.close();
            long j10 = this.f20320u;
            if (!z3) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // v8.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f20321v;
        i iVar = (i) this.f20322w;
        f fVar = (f) cVar.f13373x;
        long e = ((w8.a) cVar.B).e() + this.f20320u;
        fVar.getClass();
        fVar.k(new u8.c(e, iVar));
        return null;
    }

    @Override // ib.a
    public Object g(o oVar) {
        return ((rd.f) this.f20321v).b(oVar, this.f20320u, (HashMap) this.f20322w);
    }

    @Override // gd.a
    public void i(gd.b bVar) {
        ((b) bVar.get()).d((String) this.f20321v, this.f20320u, (j1) this.f20322w);
    }

    public /* synthetic */ a(Object obj, Object obj2, long j10) {
        this.f20321v = obj;
        this.f20322w = obj2;
        this.f20320u = j10;
    }
}
