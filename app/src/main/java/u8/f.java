package u8;
import a.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import n8.i;

/* loaded from: classes.dex */
public final class f implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final k8.c f27121z = new k8.c("proto");

    /* renamed from: u, reason: collision with root package name */
    public final h f27122u;

    /* renamed from: v, reason: collision with root package name */
    public final w8.a f27123v;

    /* renamed from: w, reason: collision with root package name */
    public final w8.a f27124w;

    /* renamed from: x, reason: collision with root package name */
    public final a f27125x;

    /* renamed from: y, reason: collision with root package name */
    public final oe.a f27126y;

    public f(w8.a aVar, w8.a aVar2, a aVar3, h hVar, oe.a aVar4) {
        this.f27122u = hVar;
        this.f27123v = aVar;
        this.f27124w = aVar2;
        this.f27125x = aVar3;
        this.f27126y = aVar4;
    }

    public static Long j(SQLiteDatabase sQLiteDatabase, i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f21181a, String.valueOf(x8.a(iVar.f21183c))));
        byte[] bArr = iVar.f21182b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String r(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f27114a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object w(Cursor cursor, d dVar) {
        try {
            return dVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27122u.close();
    }

    public final SQLiteDatabase f() {
        h hVar = this.f27122u;
        Objects.requireNonNull(hVar);
        w8.a aVar = this.f27124w;
        long e = aVar.e();
        while (true) {
            try {
                return hVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e8) {
                if (aVar.e() < this.f27125x.f27112c + e) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e8);
                }
            }
        }
    }

    public final Object k(d dVar) {
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            Object apply = dVar.apply(f10);
            f10.setTransactionSuccessful();
            return apply;
        } finally {
            f10.endTransaction();
        }
    }

    public final ArrayList m(SQLiteDatabase sQLiteDatabase, i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long j10 = j(sQLiteDatabase, iVar);
        if (j10 == null) {
            return arrayList;
        }
        w(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{j10.toString()}, null, null, null, String.valueOf(i)), new e7.c(7, this, arrayList, iVar));
        return arrayList;
    }

    public final void o(long j10, q8.c cVar, String str) {
        k(new lc.a(str, cVar, j10));
    }

    public final Object p(v8.b bVar) {
        SQLiteDatabase f10 = f();
        w8.a aVar = this.f27124w;
        long e = aVar.e();
        while (true) {
            try {
                f10.beginTransaction();
                try {
                    Object execute = bVar.execute();
                    f10.setTransactionSuccessful();
                    return execute;
                } finally {
                    f10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e8) {
                if (aVar.e() < this.f27125x.f27112c + e) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e8);
                }
            }
        }
    }
}
