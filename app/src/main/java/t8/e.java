package t8;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements v8.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25676u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u8.f f25677v;

    public /* synthetic */ e(u8.f fVar, int i) {
        this.f25676u = i;
        this.f25677v = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nd.o, java.lang.Object] */
    @Override // v8.b
    public final Object execute() {
        SQLiteDatabase f10;
        int i = this.f25676u;
        u8.f fVar = this.f25677v;
        switch (i) {
            case 0:
                fVar.getClass();
                int i10 = q8.a.e;
                Object obj = new Object();
                obj.f21272v = null;
                obj.f21273w = new ArrayList();
                obj.f21274x = null;
                obj.f21271u = "";
                HashMap hashMap = new HashMap();
                f10 = fVar.f();
                f10.beginTransaction();
                try {
                    q8.a aVar = (q8.a) u8.f.w(f10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new e7.c(8, fVar, hashMap, obj));
                    f10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            default:
                long e = fVar.f27123v.e() - fVar.f27125x.f27113d;
                f10 = fVar.f();
                f10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(e)};
                    Cursor rawQuery = f10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            fVar.o(rawQuery.getInt(0), q8.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = f10.delete("events", "timestamp_ms < ?", strArr);
                    f10.setTransactionSuccessful();
                    f10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}