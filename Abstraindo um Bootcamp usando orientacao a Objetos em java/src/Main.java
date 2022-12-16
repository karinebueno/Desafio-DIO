public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
# Created by https://www.toptal.com/developers/gitignore/api/java,intellij,eclipse,visualstudiocode
        # Edit at https://www.toptal.com/developers/gitignore?templates=java,intellij,eclipse,visualstudiocode

        ### Eclipse ###
        .metadata
        bin/
        tmp/
        *.tmp
        *.bak
        *.swp
        *~.nib
        local.properties
        .settings/
        .loadpath
        .recommenders

        # External tool builders
        .externalToolBuilders/

        # Locally stored "Eclipse launch configurations"
        *.launch

        # PyDev specific (Python IDE for Eclipse)
        *.pydevproject

        # CDT-specific (C/C++ Development Tooling)
        .cproject

        # CDT- autotools
        .autotools

        # Java annotation processor (APT)
        .factorypath

        # PDT-specific (PHP Development Tools)
        .buildpath

        # sbteclipse plugin
        .target

        # Tern plugin
        .tern-project

        # TeXlipse plugin
        .texlipse

        # STS (Spring Tool Suite)
        .springBeans

        # Code Recommenders
        .recommenders/

        # Annotation Processing
        .apt_generated/
        .apt_generated_test/

        # Scala IDE specific (Scala & Java development for Eclipse)
        .cache-main
        .scala_dependencies
        .worksheet

        # Uncomment this line if you wish to ignore the project description file.
        # Typically, this file would be tracked if it contains build/dependency configurations:
        #.project

        ### Eclipse Patch ###
        # Spring Boot Tooling
        .sts4-cache/

        ### Intellij ###
        # Covers JetBrains IDEs: IntelliJ, RubyMine, PhpStorm, AppCode, PyCharm, CLion, Android Studio, WebStorm and Rider
        # Reference: https://intellij-support.jetbrains.com/hc/en-us/articles/206544839

        # User-specific stuff
        .idea/**/workspace.xml
        .idea/**/tasks.xml
        .idea/**/usage.statistics.xml
        .idea/**/dictionaries
        .idea/**/shelf

        # AWS User-specific
        .idea/**/aws.xml

        # Generated files
        .idea/**/contentModel.xml

        # Sensitive or high-churn files
        .idea/**/dataSources/
        .idea/**/dataSources.ids
        .idea/**/dataSources.local.xml
        .idea/**/sqlDataSources.xml
        .idea/**/dynamic.xml
        .idea/**/uiDesigner.xml
        .idea/**/dbnavigator.xml

        # Gradle
        .idea/**/gradle.xml
        .idea/**/libraries

        # Gradle and Maven with auto-import
        # When using Gradle or Maven with auto-import, you should exclude module files,
        # since they will be recreated, and may cause churn.  Uncomment if using
        # auto-import.
        # .idea/artifacts
        # .idea/compiler.xml
        # .idea/jarRepositories.xml
        # .idea/modules.xml
        # .idea/*.iml
# .idea/modules
# *.iml
# *.ipr

# CMake
cmake-build-*/

        # Mongo Explorer plugin
        .idea/**/mongoSettings.xml

        # File-based project format
        *.iws

        # IntelliJ
        out/

        # mpeltonen/sbt-idea plugin
        .idea_modules/

        # JIRA plugin
        atlassian-ide-plugin.xml

        # Cursive Clojure plugin
        .idea/replstate.xml

        # SonarLint plugin
        .idea/sonarlint/

        # Crashlytics plugin (for Android Studio and IntelliJ)
        com_crashlytics_export_strings.xml
        crashlytics.properties
        crashlytics-build.properties
        fabric.properties

        # Editor-based Rest Client
        .idea/httpRequests

        # Android studio 3.1+ serialized cache file
        .idea/caches/build_file_checksums.ser

        ### Intellij Patch ###
        # Comment Reason: https://github.com/joeblau/gitignore.io/issues/186#issuecomment-215987721

        # *.iml
        # modules.xml
        # .idea/misc.xml
        # *.ipr

        # Sonarlint plugin
        # https://plugins.jetbrains.com/plugin/7973-sonarlint
        .idea/**/sonarlint/

        # SonarQube Plugin
        # https://plugins.jetbrains.com/plugin/7238-sonarqube-community-plugin
        .idea/**/sonarIssues.xml

        # Markdown Navigator plugin
        # https://plugins.jetbrains.com/plugin/7896-markdown-navigator-enhanced
        .idea/**/markdown-navigator.xml
        .idea/**/markdown-navigator-enh.xml
        .idea/**/markdown-navigator/

        # Cache file creation bug
        # See https://youtrack.jetbrains.com/issue/JBR-2257
        .idea/$CACHE_FILE$

        # CodeStream plugin
        # https://plugins.jetbrains.com/plugin/12206-codestream
        .idea/codestream.xml

        # Azure Toolkit for IntelliJ plugin
        # https://plugins.jetbrains.com/plugin/8053-azure-toolkit-for-intellij
        .idea/**/azureSettings.xml

        ### Java ###
        # Compiled class file
        *.class

        # Log file
        *.log

        # BlueJ files
        *.ctxt

        # Mobile Tools for Java (J2ME)
        .mtj.tmp/

        # Package Files #
        *.jar
        *.war
        *.nar
        *.ear
        *.zip
        *.tar.gz
        *.rar

        # virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
        hs_err_pid*
        replay_pid*

        ### VisualStudioCode ###
        .vscode/*
!.vscode/settings.json
!.vscode/tasks.json
!.vscode/launch.json
!.vscode/extensions.json
!.vscode/*.code-snippets

# Local History for Visual Studio Code
.history/

# Built Visual Studio Code Extensions
*.vsix

### VisualStudioCode Patch ###
# Ignore all local history of files
.history
.ionide

# End of https://www.toptal.com/developers/gitignore/api/java,intellij,eclipse,visualstudiocode