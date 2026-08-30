package mf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f20807u;

    /* renamed from: v, reason: collision with root package name */
    public int f20808v;

    /* renamed from: w, reason: collision with root package name */
    public int f20809w;

    /* renamed from: x, reason: collision with root package name */
    public int f20810x;

    /* renamed from: y, reason: collision with root package name */
    public int f20811y;

    public d(CharSequence charSequence) {
        charSequence.getClass();
        this.f20807u = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10 = this.f20808v;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.f20811y < 0) {
            this.f20808v = 2;
            return false;
        }
        CharSequence charSequence = this.f20807u;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f20809w; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i = i12 + 1) >= charSequence.length() || charSequence.charAt(i) != '\n') {
                    i11 = 1;
                }
                length = i12;
                this.f20808v = 1;
                this.f20811y = i11;
                this.f20810x = length;
                return true;
            }
        }
        i11 = -1;
        this.f20808v = 1;
        this.f20811y = i11;
        this.f20810x = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f20808v = 0;
            int i = this.f20810x;
            int i10 = this.f20809w;
            this.f20809w = this.f20811y + i;
            return this.f20807u.subSequence(i10, i).toString();
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
