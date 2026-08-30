package z1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31869a;

    /* renamed from: b, reason: collision with root package name */
    public final q f31870b;

    /* renamed from: c, reason: collision with root package name */
    public final q f31871c;

    /* renamed from: d, reason: collision with root package name */
    public final q f31872d;
    public final q e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f31873f;

    /* JADX WARN: Multi-variable type inference failed */
    public r(r[] rVarArr) {
        this.f31869a = 0;
        this.f31873f = rVarArr;
        int length = rVarArr.length;
        q[] qVarArr = new q[length];
        for (int i = 0; i < length; i++) {
            qVarArr[i] = ((r[]) this.f31873f)[i].b();
        }
        this.f31870b = new q(1, new n1(qVarArr, 0));
        int length2 = ((r[]) this.f31873f).length;
        q[] qVarArr2 = new q[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            qVarArr2[i10] = ((r[]) this.f31873f)[i10].d();
        }
        this.f31871c = new q(0, new p(qVarArr2, 0));
        int length3 = ((r[]) this.f31873f).length;
        q[] qVarArr3 = new q[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            qVarArr3[i11] = ((r[]) this.f31873f)[i11].c();
        }
        this.f31872d = new q(1, new n1(qVarArr3, 1));
        int length4 = ((r[]) this.f31873f).length;
        q[] qVarArr4 = new q[length4];
        for (int i12 = 0; i12 < length4; i12++) {
            qVarArr4[i12] = ((r[]) this.f31873f)[i12].a();
        }
        this.e = new q(0, new p(qVarArr4, 1));
    }

    public final q a() {
        switch (this.f31869a) {
            case 0:
                return this.e;
            default:
                return this.e;
        }
    }

    public final q b() {
        switch (this.f31869a) {
            case 0:
                return this.f31870b;
            default:
                return this.f31870b;
        }
    }

    public final q c() {
        switch (this.f31869a) {
            case 0:
                return this.f31872d;
            default:
                return this.f31872d;
        }
    }

    public final q d() {
        switch (this.f31869a) {
            case 0:
                return this.f31871c;
            default:
                return this.f31871c;
        }
    }

    public final String toString() {
        switch (this.f31869a) {
            case 0:
                return qe.k.q((r[]) this.f31873f, null, 57);
            default:
                return "RectRulers(" + ((String) this.f31873f) + ')';
        }
    }

    public r(String str) {
        this.f31869a = 1;
        this.f31873f = str;
        this.f31870b = new q(1, null);
        this.f31871c = new q(0, null);
        this.f31872d = new q(1, null);
        this.e = new q(0, null);
    }
}
