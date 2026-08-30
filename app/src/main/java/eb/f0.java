package eb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f0 extends z {

    /* renamed from: x, reason: collision with root package name */
    public final k f16126x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16127y;

    public f0(d1 d1Var) {
        super(d1Var);
        this.f16126x = new k(this, ((d1) this.f3443v).f16102u);
    }

    public static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            cursor.close();
            return -1L;
        } finally {
        }
    }

    @Override // eb.z
    public final boolean A() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.f0.C(byte[], int):boolean");
    }

    public final void D() {
        int delete;
        u();
        try {
            SQLiteDatabase F = F();
            if (F != null && (delete = F.delete("messages", null, null)) > 0) {
                f().I.f(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e) {
            f().A.f(e, "Error resetting local analytics data. error");
        }
    }

    public final boolean E() {
        u();
        if (!this.f16127y && ((d1) this.f3443v).f16102u.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i10 = 0; i10 < 5; i10++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase F = F();
                            if (F == null) {
                                this.f16127y = true;
                                if (F != null) {
                                    F.close();
                                }
                            } else {
                                F.beginTransaction();
                                F.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                F.setTransactionSuccessful();
                                F.endTransaction();
                                F.close();
                                return true;
                            }
                        } catch (SQLiteException e) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            f().A.f(e, "Error deleting app launch break from local database");
                            this.f16127y = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e8) {
                    f().A.f(e8, "Error deleting app launch break from local database");
                    this.f16127y = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            f().D.g("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    public final SQLiteDatabase F() {
        if (this.f16127y) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f16126x.getWritableDatabase();
        if (writableDatabase == null) {
            this.f16127y = true;
            return null;
        }
        return writableDatabase;
    }
}
