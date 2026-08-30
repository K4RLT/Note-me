package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j11 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7282a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public z91 f7283b = null;

    /* renamed from: c, reason: collision with root package name */
    public z91 f7284c = null;

    public final boolean a(ch chVar) {
        byte[] a10 = chVar.z().A().A().a();
        byte[] a11 = chVar.z().C().a();
        try {
            try {
                if (!this.f7282a.getAndSet(true)) {
                    try {
                        zj1.a();
                        com.google.android.gms.internal.mlkit_vision_digital_ink.gw g8 = b80.g(new String(ay0.t("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false)));
                        ho0 ho0Var = b80.K;
                        this.f7283b = (z91) g8.J(ho0Var, z91.class);
                        this.f7284c = (z91) b80.g(new String(ay0.t("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).J(ho0Var, z91.class);
                    } catch (Exception e) {
                        throw new GeneralSecurityException("Failed to verify program", e);
                    }
                }
                z91 z91Var = this.f7283b;
                if (z91Var != null) {
                    z91Var.a(a10, a11);
                    return true;
                }
                throw new GeneralSecurityException();
            } catch (GeneralSecurityException unused) {
                z91 z91Var2 = this.f7284c;
                if (z91Var2 != null) {
                    z91Var2.a(a10, a11);
                    return true;
                }
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
