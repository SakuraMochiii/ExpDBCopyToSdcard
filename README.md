# ExpDBCopyToSdcard

This guide demonstrates how to export a database file from an app to an SD card using Android API. A demo application is provided to illustrate the process.

Ensure your app has the necessary permissions to access both the database and the SD card. This typically involves adding permissions to your AndroidManifest.xml file.
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.MOUNT_UNMOUNT_FILESYSTEMS" />

