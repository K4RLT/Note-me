package r5;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class j extends i implements q5.c {

    /* renamed from: v, reason: collision with root package name */
    public final SQLiteStatement f24578v;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f24578v = sQLiteStatement;
    }

    public final int f() {
        return this.f24578v.executeUpdateDelete();
    }
}
