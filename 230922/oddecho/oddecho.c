#include <stdio.h>

int main() {
  int i, n;
  char tmp[101];

  scanf("%d", &n);
  for (i = 1; i < n + 1; i++) {
    scanf("%100s", tmp);
    if (i % 2 == 1) {
      printf("%s\n", tmp);
    }
  }

  return 0;
}
