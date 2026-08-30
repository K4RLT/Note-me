package com.google.android.gms.internal.ads;
import l.b;
import r5.c;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public abstract class iw0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7239a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7240b;

    public /* synthetic */ iw0(int i, int i10) {
        this.f7239a = i10;
        this.f7240b = i;
    }

    public static void a(String str) {
        int i;
        boolean z3;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z9 = false;
            while (i10 <= length) {
                if (!z9) {
                    i = i10;
                } else {
                    i = length;
                }
                if (kotlin.jvm.internal.b(str.charAt(i), 32) <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z9) {
                    if (!z3) {
                        z9 = true;
                    } else {
                        i10++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public static String g(int i) {
        char c10 = (char) ((i >> 24) & 255);
        int length = String.valueOf(c10).length();
        char c11 = (char) ((i >> 16) & 255);
        int length2 = String.valueOf(c11).length();
        char c12 = (char) ((i >> 8) & 255);
        char c13 = (char) (i & 255);
        StringBuilder sb2 = new StringBuilder(length + length2 + String.valueOf(c12).length() + String.valueOf(c13).length());
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(c12);
        sb2.append(c13);
        return sb2.toString();
    }

    public abstract void c(c cVar);

    public abstract void d(c cVar, int i, int i10);

    public abstract void e(c cVar);

    public abstract void f(c cVar, int i, int i10);

    public String toString() {
        switch (this.f7239a) {
            case 0:
                return g(this.f7240b);
            default:
                return super.toString();
        }
    }

    public void b(c cVar) {
    }
}
