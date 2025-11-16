package peterfajdiga.fastdraw.launcher.launcheritem;

import android.content.Context;

import peterfajdiga.fastdraw.launcher.OreoShortcuts;

public interface ShortcutItem extends LauncherItem {
    void delete(Context context) throws OreoShortcuts.UserLockedException, OreoShortcuts.HostPermissionException;
}
