package cd;

import ya.x;

/* loaded from: classes.dex */
public final class h implements zc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4095a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4096b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4097c = false;

    /* renamed from: d, reason: collision with root package name */
    public zc.c f4098d;
    public final zc.e e;

    public /* synthetic */ h(zc.e eVar, int i) {
        this.f4095a = i;
        this.e = eVar;
    }

    @Override // zc.g
    public final zc.g b(String str) {
        switch (this.f4095a) {
            case 0:
                if (!this.f4096b) {
                    this.f4096b = true;
                    ((f) this.e).i(this.f4098d, str, this.f4097c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f4096b) {
                    this.f4096b = true;
                    ((wa.f) this.e).c(this.f4098d, str, this.f4097c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f4096b) {
                    this.f4096b = true;
                    ((x) this.e).c(this.f4098d, str, this.f4097c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override // zc.g
    public final zc.g c(boolean z3) {
        switch (this.f4095a) {
            case 0:
                if (!this.f4096b) {
                    this.f4096b = true;
                    ((f) this.e).c(this.f4098d, z3 ? 1 : 0, this.f4097c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f4096b) {
                    this.f4096b = true;
                    ((wa.f) this.e).h(this.f4098d, z3 ? 1 : 0, this.f4097c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f4096b) {
                    this.f4096b = true;
                    ((x) this.e).h(this.f4098d, z3 ? 1 : 0, this.f4097c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
