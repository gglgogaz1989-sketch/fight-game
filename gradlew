#!/bin/sh

# Код инициализации Gradle Wrapper для Unix-систем
APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

# Добавляем стандартные пути
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Поиск Java
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD="java"
fi

# Проверка наличия Jar-файла враппера
WRAPPER_JAR="gradle/wrapper/gradle-wrapper.jar"
if [ ! -e "$WRAPPER_JAR" ]; then
    echo "Ошибка: $WRAPPER_JAR не найден!"
    exit 1
fi

# Запуск Gradle
exec "$JAVACMD" $DEFAULT_JVM_OPTS -classpath "$WRAPPER_JAR" org.gradle.wrapper.GradleWrapperMain "$@"

