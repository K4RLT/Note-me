package z5;
import a.a;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public final class f implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static f f31918b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f31919a;

    public f(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f31919a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (k.f31929g.b()) {
            return this.f31919a.deleteProfile(str);
        }
        throw a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (k.f31929g.b()) {
            return this.f31919a.getAllProfileNames();
        }
        throw a();
    }

    @Override // androidx.webkit.ProfileStore
    public final y5.a getOrCreateProfile(String str) {
        if (k.f31929g.b()) {
            return new t.a(12, (ProfileBoundaryInterface) ug.a(ProfileBoundaryInterface.class, this.f31919a.getOrCreateProfile(str)));
        }
        throw a();
    }

    @Override // androidx.webkit.ProfileStore
    public final y5.a getProfile(String str) {
        if (k.f31929g.b()) {
            InvocationHandler profile = this.f31919a.getProfile(str);
            if (profile != null) {
                return new t.a(12, (ProfileBoundaryInterface) ug.a(ProfileBoundaryInterface.class, profile));
            }
            return null;
        }
        throw a();
    }
}
