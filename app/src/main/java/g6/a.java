package g6;

import android.os.Build;
import j6.p;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h6.e eVar, int i) {
        super(eVar);
        this.f17551b = i;
        eVar.getClass();
        switch (i) {
            case 2:
                super(eVar);
                this.f17552c = 7;
                return;
            case 3:
                super(eVar);
                this.f17552c = 7;
                return;
            case 4:
                super(eVar);
                this.f17552c = 9;
                return;
            default:
                this.f17552c = 6;
                return;
        }
    }

    @Override // g6.c
    public final int a() {
        switch (this.f17551b) {
            case 0:
                return this.f17552c;
            case 1:
                return this.f17552c;
            case 2:
                return this.f17552c;
            case 3:
                return this.f17552c;
            default:
                return this.f17552c;
        }
    }

    @Override // g6.c
    public final boolean b(p pVar) {
        switch (this.f17551b) {
            case 0:
                return pVar.f18951j.f259b;
            case 1:
                return pVar.f18951j.f261d;
            case 2:
                if (pVar.f18951j.f258a == 2) {
                    return true;
                }
                return false;
            case 3:
                int i = pVar.f18951j.f258a;
                if (i != 3 && (Build.VERSION.SDK_INT < 30 || i != 6)) {
                    return false;
                }
                return true;
            default:
                return pVar.f18951j.e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // g6.c
    public final boolean c(Object obj) {
        boolean booleanValue;
        switch (this.f17551b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 2:
                f6.d dVar = (f6.d) obj;
                dVar.getClass();
                int i = Build.VERSION.SDK_INT;
                boolean z3 = dVar.f16759a;
                if (i < 26 ? !z3 : !(z3 && dVar.f16760b)) {
                    return true;
                }
                return false;
            case 3:
                f6.d dVar2 = (f6.d) obj;
                dVar2.getClass();
                if (dVar2.f16759a && !dVar2.f16761c) {
                    return false;
                }
                return true;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h6.a aVar) {
        super(aVar);
        this.f17551b = 1;
        aVar.getClass();
        this.f17552c = 5;
    }
}
