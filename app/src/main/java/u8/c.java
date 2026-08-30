package u8;
import a.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import n8.i;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements d {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f27117u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f27118v;

    public /* synthetic */ c(long j10, i iVar) {
        this.f27117u = j10;
        this.f27118v = iVar;
    }

    @Override // u8.d
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f27117u));
        i iVar = this.f27118v;
        String str = iVar.f21181a;
        k8.d dVar = iVar.f21183c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(x8.a(dVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(x8.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
