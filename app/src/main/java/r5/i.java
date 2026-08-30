package r5;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class i implements q5.c {

    /* renamed from: u, reason: collision with root package name */
    public final SQLiteProgram f24577u;

    public i(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.f24577u = sQLiteProgram;
    }

    @Override // q5.c
    public final void b(int i, long j10) {
        this.f24577u.bindLong(i, j10);
    }

    @Override // q5.c
    public final void c(double d2, int i) {
        this.f24577u.bindDouble(i, d2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24577u.close();
    }

    @Override // q5.c
    public final void g(int i) {
        this.f24577u.bindNull(i);
    }

    @Override // q5.c
    public final void h() {
        this.f24577u.clearBindings();
    }

    @Override // q5.c
    public final void n(int i, String str) {
        str.getClass();
        this.f24577u.bindString(i, str);
    }

    @Override // q5.c
    public final void z(byte[] bArr, int i) {
        this.f24577u.bindBlob(i, bArr);
    }
}
