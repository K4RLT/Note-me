package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zl1 extends Writer {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13208u;

    /* renamed from: v, reason: collision with root package name */
    public final StringBuilder f13209v;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f13210w;

    public zl1() {
        this.f13208u = 1;
        this.f13209v = new StringBuilder(128);
        this.f13210w = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f13208u) {
            case 0:
                this.f13209v.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f13208u) {
            case 0:
                return;
            default:
                k();
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f13208u) {
            case 0:
                return;
            default:
                k();
                return;
        }
    }

    public void k() {
        StringBuilder sb2 = this.f13209v;
        if (sb2.length() > 0) {
            Log.d((String) this.f13210w, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i10) {
        switch (this.f13208u) {
            case 0:
                yl1 yl1Var = (yl1) this.f13210w;
                yl1Var.f12909u = cArr;
                yl1Var.f12910v = null;
                this.f13209v.append((CharSequence) yl1Var, i, i10 + i);
                return;
            default:
                for (int i11 = 0; i11 < i10; i11++) {
                    char c10 = cArr[i + i11];
                    if (c10 == '\n') {
                        k();
                    } else {
                        this.f13209v.append(c10);
                    }
                }
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f13208u) {
            case 0:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i10) {
        switch (this.f13208u) {
            case 0:
                this.f13209v.append(charSequence, i, i10);
                return this;
            default:
                return super.append(charSequence, i, i10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i10) {
        switch (this.f13208u) {
            case 0:
                append(charSequence, i, i10);
                return this;
            default:
                return super.append(charSequence, i, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public zl1(StringBuilder sb2) {
        this.f13208u = 0;
        this.f13210w = new Object();
        this.f13209v = sb2;
    }

    private final void f() {
    }

    private final void j() {
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i10) {
        switch (this.f13208u) {
            case 0:
                Objects.requireNonNull(str);
                this.f13209v.append((CharSequence) str, i, i10 + i);
                return;
            default:
                super.write(str, i, i10);
                return;
        }
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.f13208u) {
            case 0:
                this.f13209v.append((char) i);
                return;
            default:
                super.write(i);
                return;
        }
    }
}
