package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g9.r;
import l9.l;
import r.e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* loaded from: classes.dex */
public final class rh0 extends hw0 {

    /* renamed from: u, reason: collision with root package name */
    public final Context f10220u;

    /* renamed from: v, reason: collision with root package name */
    public final wx f10221v;

    public rh0(Context context, wx wxVar) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) g9.r.e.f17698c.a(sl.A9)).intValue());
        this.f10220u = context;
        this.f10221v = wxVar;
    }

    public static void k(SQLiteDatabase sQLiteDatabase, l9.l lVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb2;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append("event_state = 1");
            String sb4 = sb3.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb4, null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr2 = new String[count];
                int i = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("timestamp");
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j10 = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb2 = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            f9.k.C.f16819k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - j10;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter("bd", Long.toString(currentTimeMillis));
                            String valueOf = String.valueOf(clearQuery.build());
                            StringBuilder sb5 = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb5.append(valueOf);
                            sb5.append("&");
                            sb5.append(encodedQuery);
                            sb2 = sb5.toString();
                        }
                        strArr2[i] = sb2;
                    }
                    i++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i10 = 0; i10 < count; i10++) {
                    lVar.a(null, strArr2[i10]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    public final void f(dr0 dr0Var) {
        qf qfVar = new qf(6, this);
        wx wxVar = this.f10221v;
        ac.b j10 = wxVar.j(qfVar);
        j10.a(new t81(j10, 0, new tf(this, 27, dr0Var)), wxVar);
    }

    public final void j(String str) {
        f(new ja1(str, 8));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
