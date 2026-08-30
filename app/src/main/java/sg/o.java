package sg;

import q.x;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25298a;

    /* renamed from: b, reason: collision with root package name */
    public int f25299b;

    /* renamed from: c, reason: collision with root package name */
    public int f25300c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25301d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public o f25302f;

    /* renamed from: g, reason: collision with root package name */
    public o f25303g;

    public o(byte[] bArr, int i, int i10) {
        bArr.getClass();
        this.f25298a = bArr;
        this.f25299b = i;
        this.f25300c = i10;
        this.f25301d = true;
        this.e = false;
    }

    public final o a() {
        o oVar;
        o oVar2 = this.f25302f;
        if (oVar2 != this) {
            oVar = oVar2;
        } else {
            oVar = null;
        }
        o oVar3 = this.f25303g;
        if (oVar3 != null) {
            oVar3.f25302f = oVar2;
            o oVar4 = this.f25302f;
            if (oVar4 != null) {
                oVar4.f25303g = oVar3;
                this.f25302f = null;
                this.f25303g = null;
                return oVar;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        kotlin.jvm.internal.l.g();
        throw null;
    }

    public final void b(o oVar) {
        oVar.getClass();
        oVar.f25303g = this;
        oVar.f25302f = this.f25302f;
        o oVar2 = this.f25302f;
        if (oVar2 != null) {
            oVar2.f25303g = oVar;
            this.f25302f = oVar;
        } else {
            kotlin.jvm.internal.l.g();
            throw null;
        }
    }

    public final o c() {
        this.f25301d = true;
        return new o(this.f25298a, this.f25299b, this.f25300c);
    }

    public final void d(o oVar, int i) {
        oVar.getClass();
        byte[] bArr = oVar.f25298a;
        if (oVar.e) {
            int i10 = oVar.f25300c;
            int i11 = i10 + i;
            if (i11 > 8192) {
                if (!oVar.f25301d) {
                    int i12 = oVar.f25299b;
                    if (i11 - i12 <= 8192) {
                        bArr.getClass();
                        System.arraycopy(bArr, i12, bArr, 0, i10 - i12);
                        oVar.f25300c -= oVar.f25299b;
                        oVar.f25299b = 0;
                    } else {
                        x.m();
                        return;
                    }
                } else {
                    x.m();
                    return;
                }
            }
            int i13 = this.f25299b;
            int i14 = oVar.f25300c;
            byte[] bArr2 = this.f25298a;
            bArr2.getClass();
            bArr.getClass();
            System.arraycopy(bArr2, i13, bArr, i14, i);
            oVar.f25300c += i;
            this.f25299b += i;
            return;
        }
        x.o("only owner can write");
    }

    public o() {
        this.f25298a = new byte[8192];
        this.e = true;
        this.f25301d = false;
    }
}
