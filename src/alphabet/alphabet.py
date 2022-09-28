import string

def lcs(s, p):
    # find the longest consecutive substring in s of pattern p
    n, m = len(s), len(p)
    llcd = [[0]*(n+1)]*(m+1)
    for i in range(m+1):
        for j in range(n+1):
            if i==0 or j==0:
                llcd[i][j] = 0
            elif p[i-1] == s[j-1]:
                llcd[i][j] = 1 + llcd[i-1][j-1]
            else:
                llcd[i][j] = max(llcd[i-1][j], llcd[i][j-1])

    return llcd[m][n]


print(26 - lcs(input(), string.ascii_lowercase))
