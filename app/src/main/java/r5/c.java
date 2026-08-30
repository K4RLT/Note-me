package r5;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import fg.o;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f24550v = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f24551w = new String[0];

    /* renamed from: x, reason: collision with root package name */
    public static final Object f24552x;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f24553y;

    /* renamed from: u, reason: collision with root package name */
    public final SQLiteDatabase f24554u;

    static {
        o oVar = new o(22);
        pe.h hVar = pe.h.f22690u;
        f24552x = pe.a.c(hVar, oVar);
        f24553y = pe.a.c(hVar, new o(23));
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f24554u = sQLiteDatabase;
    }

    public final boolean J() {
        return this.f24554u.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24554u.close();
    }

    public final void f() {
        this.f24554u.beginTransaction();
    }

    public final boolean isOpen() {
        return this.f24554u.isOpen();
    }

    public final void j() {
        this.f24554u.beginTransactionNonExclusive();
    }

    public final j k(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.f24554u.compileStatement(str);
        compileStatement.getClass();
        return new j(compileStatement);
    }

    public final void m() {
        this.f24554u.endTransaction();
    }

    public final void o(String str) {
        this.f24554u.execSQL(str);
    }

    public final void p(Object[] objArr) {
        this.f24554u.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final Cursor r(q5.d dVar) {
        final a aVar = new a(0, dVar);
        Cursor rawQueryWithFactory = this.f24554u.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: r5.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) a.this.d(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.j(), f24551w, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    public final void w() {
        this.f24554u.setTransactionSuccessful();
    }
}
