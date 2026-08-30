package ca;
import b.b;

import fa.y;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f4053c;

    public /* synthetic */ o(boolean z3, String str, n nVar) {
        this.f4051a = z3;
        this.f4052b = str;
        this.f4053c = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        MessageDigest messageDigest;
        int i = 0;
        boolean z3 = this.f4051a;
        String str2 = this.f4052b;
        n nVar = this.f4053c;
        if (!z3 && b(str2, nVar, true, false).f4067a) {
            str = "debug cert rejected";
        } else {
            str = "not allowed";
        }
        while (true) {
            if (i < 2) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            } else {
                messageDigest = null;
                break;
            }
        }
        y.h(messageDigest);
        return str + ": pkg=" + str2 + ", sha256=" + la.b(messageDigest.digest(nVar.f4050w)) + ", atk=" + z3 + ", ver=12451000.false";
    }
}
