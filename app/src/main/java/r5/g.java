package r5;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.iw0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    /* renamed from: u, reason: collision with root package name */
    public final Context f24565u;

    /* renamed from: v, reason: collision with root package name */
    public final ic.c f24566v;

    /* renamed from: w, reason: collision with root package name */
    public final iw0 f24567w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f24568x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24569y;

    /* renamed from: z, reason: collision with root package name */
    public final t5.a f24570z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final ic.c cVar, final iw0 iw0Var, boolean z3) {
        super(context, str, null, iw0Var.f7240b, new DatabaseErrorHandler() { // from class: r5.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = g.B;
                sQLiteDatabase.getClass();
                ic.c cVar2 = cVar;
                c cVar3 = (c) cVar2.f18393v;
                if (cVar3 == null || !cVar3.f24554u.equals(sQLiteDatabase)) {
                    cVar3 = new c(sQLiteDatabase);
                    cVar2.f18393v = cVar3;
                }
                SQLiteDatabase sQLiteDatabase2 = cVar3.f24554u;
                iw0.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + cVar3 + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        iw0.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                iw0.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                iw0.a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    cVar3.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        context.getClass();
        iw0Var.getClass();
        this.f24565u = context;
        this.f24566v = cVar;
        this.f24567w = iw0Var;
        this.f24568x = z3;
        if (str == null) {
            str2 = p.a.i();
        } else {
            str2 = str;
        }
        this.f24570z = new t5.a(str2, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        t5.a aVar = this.f24570z;
        try {
            aVar.a(aVar.f25643a);
            super.close();
            this.f24566v.f18393v = null;
            this.A = false;
        } finally {
            aVar.b();
        }
    }

    public final c f(boolean z3) {
        boolean z9;
        t5.a aVar = this.f24570z;
        try {
            if (!this.A && getDatabaseName() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            aVar.a(z9);
            this.f24569y = false;
            SQLiteDatabase k3 = k(z3);
            if (this.f24569y) {
                close();
                c f10 = f(z3);
                aVar.b();
                return f10;
            }
            c j10 = j(k3);
            aVar.b();
            return j10;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final c j(SQLiteDatabase sQLiteDatabase) {
        ic.c cVar = this.f24566v;
        cVar.getClass();
        c cVar2 = (c) cVar.f18393v;
        if (cVar2 != null && cVar2.f24554u.equals(sQLiteDatabase)) {
            return cVar2;
        }
        c cVar3 = new c(sQLiteDatabase);
        cVar.f18393v = cVar3;
        return cVar3;
    }

    public final SQLiteDatabase k(boolean z3) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z9 = this.A;
        Context context = this.f24565u;
        if (databaseName != null && !z9 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z3) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z3) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int ordinal = eVar.f24557u.ordinal();
                    th = eVar.f24558v;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            l4.a.o();
                            return null;
                        }
                    } else {
                        throw th;
                    }
                }
                if ((th instanceof SQLiteException) && databaseName != null && this.f24568x) {
                    context.deleteDatabase(databaseName);
                    try {
                        if (z3) {
                            readableDatabase = getWritableDatabase();
                            readableDatabase.getClass();
                        } else {
                            readableDatabase = getReadableDatabase();
                            readableDatabase.getClass();
                        }
                        return readableDatabase;
                    } catch (e e) {
                        throw e.f24558v;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z3 = this.f24569y;
        iw0 iw0Var = this.f24567w;
        if (!z3 && iw0Var.f7240b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            iw0Var.b(j(sQLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.f24559u, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.f24567w.c(j(sQLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.f24560v, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.getClass();
        this.f24569y = true;
        try {
            this.f24567w.d(j(sQLiteDatabase), i, i10);
        } catch (Throwable th) {
            throw new e(f.f24562x, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.f24569y) {
            try {
                this.f24567w.e(j(sQLiteDatabase));
            } catch (Throwable th) {
                throw new e(f.f24563y, th);
            }
        }
        this.A = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.getClass();
        this.f24569y = true;
        try {
            this.f24567w.f(j(sQLiteDatabase), i, i10);
        } catch (Throwable th) {
            throw new e(f.f24561w, th);
        }
    }
}
